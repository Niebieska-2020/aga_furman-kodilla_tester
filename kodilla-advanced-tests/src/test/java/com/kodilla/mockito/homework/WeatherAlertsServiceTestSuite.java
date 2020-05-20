package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

public class WeatherAlertsServiceTestSuite {

    private WeatherAlertsService weatherAlertsService = new WeatherAlertsService();
    private Subscriber subscriber = Mockito.mock(Subscriber.class);
    private Alert alert = Mockito.mock(Alert.class);
    private String location = "Krakow";
    private Set<Subscriber> subscriberSet = new HashSet<>();

    @Test
    public void subscriberShouldReceiveAlertOnlyFromSpecificLocationWhereItIsAdded() {
        // given
        String secondLocation = "Warszawa";
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);
        weatherAlertsService.addSubscriber(secondLocation, subscriberSet);

        // when
        weatherAlertsService.sendAlertFromLocation(alert, location);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test //
    public void subscriberRemovedFromLocationShouldNotReceiveAlertFromThisLocation() {
        // given
        String secondLocation = "Warszawa";
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);
        weatherAlertsService.addSubscriber(secondLocation, subscriberSet);

        // when
        weatherAlertsService.sendAlertFromLocation(alert, location);
        weatherAlertsService.removeSubscriberFromLocation(subscriber, secondLocation);
        weatherAlertsService.sendAlertFromLocation(alert, secondLocation);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test //
    public void subscriberRemovedFromAllLocationShouldNotReceiveAnyAlerts() {
        // given
        String secondLocation = "Warszawa";
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);
        weatherAlertsService.addSubscriber(secondLocation, subscriberSet);

        // when
        weatherAlertsService.removeSubscriber(subscriber);
        weatherAlertsService.sendAlertFromLocation(alert, location);
        weatherAlertsService.sendAlertFromLocation(alert, secondLocation);
        weatherAlertsService.sendAlertToUniqueSubscribers(alert);

        // then
        Mockito.verify(subscriber, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribersShouldReceiveOnlyOneAlert() {
        // given
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
        subscriberSet.add(subscriber);
        subscriberSet.add(secondSubscriber);
        subscriberSet.add(thirdSubscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);

        // when
        weatherAlertsService.sendAlertToUniqueSubscribers(alert);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldReceiveAlertWhenItIsAddedToLocation() {
        // given
        String secondLocation = "Warszawa";
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        subscriberSet.add(subscriber);
        subscriberSet.add(secondSubscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);

        // when
        weatherAlertsService.sendAlertFromLocation(alert, location);
        weatherAlertsService.sendAlertFromLocation(alert, secondLocation);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldNotReceiveAlertIfItIsNotAddedToLocation() {
        // given
        String secondLocation = "Warszawa";
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);

        // when
        weatherAlertsService.sendAlertFromLocation(alert, location);
        weatherAlertsService.sendAlertFromLocation(alert, secondLocation);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test //
    public void removedLocationAndDoNotSendAlert() {
        // given
        String secondLocation = "Warszawa";
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);
        weatherAlertsService.addSubscriber(secondLocation, subscriberSet);

        // when
        weatherAlertsService.removeLocation(location);
        weatherAlertsService.sendAlertFromLocation(alert, location);
        weatherAlertsService.sendAlertFromLocation(alert, secondLocation);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldNotSendAlertFromLocationWhichDoesNotExist() {
        // given
        subscriberSet.add(subscriber);
        weatherAlertsService.addSubscriber(location, subscriberSet);

        // when
        weatherAlertsService.sendAlertFromLocation(alert, "Szczecin");

        // then
        Mockito.verify(subscriber, Mockito.never()).receive(alert);
    }
}
