package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashSet;

public class WeatherServiceTestSuite {

    private WeatherService weatherService;
    private Subscriber subscriber = Mockito.mock(Subscriber.class);
    private Alert alert = new Alert("Alert message!");
    private Notification notification = new Notification("Some notification");
    private Location location = Location.CRACOW;

    @BeforeEach
    void beforeEach() {
        weatherService = new WeatherService();
    }

    @Test
    public void subscriberShouldReceiveAlertOnlyFromSpecificLocationWhereItIsAdded() {
        // given
        Location secondLocation = Location.WARSAW;
        weatherService.addSubscriberToLocation(location, subscriber);
        weatherService.addSubscriberToLocation(secondLocation, subscriber);

        // when
        weatherService.sendAlertFromLocation(alert, location);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldReceiveNotificationOnlyFromSpecificLocationWhereItIsAdded() {
        // given
        Location secondLocation = Location.WARSAW;
        weatherService.addSubscriberToLocation(location, subscriber);
        weatherService.addSubscriberToLocation(secondLocation, subscriber);

        // when
        weatherService.sendNotificationFromLocation(notification, location);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(notification);
    }

    @Test
    public void subscriberRemovedFromLocationShouldNotReceiveAlertFromThisLocation() {
        // given
        weatherService.addSubscriberToLocation(location, subscriber);
        weatherService.removeSubscriberFromLocation(subscriber, location);

        // when
        weatherService.sendAlertFromLocation(alert, location);

        // then
        Mockito.verify(subscriber, Mockito.never()).receive(alert);
    }

    @Test //
    public void subscriberRemovedFromAllLocationsShouldNotReceiveAnyAlerts() {
        // given
        Location secondLocation = Location.WARSAW;
        weatherService.addSubscriberToLocation(location, subscriber);
        weatherService.addSubscriberToLocation(secondLocation, subscriber);
        weatherService.removeSubscriber(subscriber);

        // when
        weatherService.sendAlertFromLocation(alert, location);
        weatherService.sendAlertFromLocation(alert, secondLocation);
        weatherService.sendAlertToUniqueSubscribers(alert);

        // then
        Mockito.verify(subscriber, Mockito.never()).receive(alert);
    }

    @Test
    public void subscribersShouldReceiveOnlyOneAlert() {
        // given
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
        weatherService.addSubscribersToLocation(location, new HashSet<>(Arrays.asList(subscriber, secondSubscriber, thirdSubscriber)));

        // when
        weatherService.sendAlertToUniqueSubscribers(alert);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscribersShouldReceiveOnlyOneNotification() {
        // given
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
        weatherService.addSubscribersToLocation(location, new HashSet<>(Arrays.asList(subscriber, secondSubscriber, thirdSubscriber)));

        // when
        weatherService.sendNotificationToUniqueSubscribers(notification);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(notification);
    }

    @Test
    public void subscriberShouldReceiveAlertWhenItIsAddedToLocation() {
        // given
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        weatherService.addSubscribersToLocation(location, new HashSet<>(Arrays.asList(subscriber, secondSubscriber)));

        // when
        weatherService.sendAlertFromLocation(alert, location);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
        Mockito.verify(secondSubscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void subscriberShouldNotReceiveAlertIfItIsNotAddedToLocation() {
        // given
        Location secondLocation = Location.WARSAW;
        weatherService.addSubscriberToLocation(location, subscriber);

        // when
        weatherService.sendAlertFromLocation(alert, location);
        weatherService.sendAlertFromLocation(alert, secondLocation);

        // then
        Mockito.verify(subscriber, Mockito.times(1)).receive(alert);
    }

    @Test
    public void shouldNotSendAlertFromLocationWhichDoesNotExist() {
        // given
        weatherService.addSubscriberToLocation(location, subscriber);
        weatherService.removeLocation(Location.SZCZECIN);

        // when
        weatherService.sendAlertFromLocation(alert, Location.SZCZECIN);

        // then
        Mockito.verify(subscriber, Mockito.never()).receive(alert);
    }
}
