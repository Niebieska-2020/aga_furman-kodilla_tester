package com.kodilla.mockito.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherAlertsService {

    private Map<String, Set<Subscriber>> weatherAlertService = new HashMap<>();

    public void addSubscriber(String location, Set<Subscriber> subscribers ) {
        weatherAlertService.put(location, subscribers);
    }

    public void removeSubscriberFromLocation(Subscriber subscriber, String location) {
        Set<Subscriber> existentSubscriber = weatherAlertService.get(location);
        if (existentSubscriber != null) {
            weatherAlertService.get(location).remove(subscriber);
        }
    }

    public void removeSubscriber(Subscriber subscriber){
        Collection<Set <Subscriber>> subscribersSets = weatherAlertService.values();
        for(Set<Subscriber> subscriberSet : subscribersSets){
            subscriberSet.remove(subscriber);
        }
    }

    public void sendAlertFromLocation(Alert alert, String location) {
        Set<Subscriber> listSubscribers = weatherAlertService.get(location);
        if (listSubscribers != null) {
            listSubscribers.forEach(subscriber -> subscriber.receive(alert));
        }
    }

    public void sendAlertToUniqueSubscribers(Alert alert) {
        Set<Subscriber> uniqueSubscribers = weatherAlertService.values().stream()
                .flatMap(subscribers -> subscribers.stream())
                .collect(Collectors.toSet());
        uniqueSubscribers.forEach(subscriber -> subscriber.receive(alert));
    }

    public void removeLocation(String location) {
        weatherAlertService.remove(location);
    }
}
