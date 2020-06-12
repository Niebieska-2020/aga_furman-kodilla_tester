package com.kodilla.mockito.homework;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherService {

    private Map<Location, Set<Subscriber>> locationSubscribers = new HashMap<>();

    public void addSubscribersToLocation(Location location, Set<Subscriber> subscribers) {
        subscribers.forEach(subscriber -> addSubscriberToLocation(location, subscriber));
    }

    public void addSubscriberToLocation(Location location, Subscriber subscriber) {
        if (locationSubscribers.containsKey(location)) {
            Set<Subscriber> currentSubscribers = locationSubscribers.get(location);
            currentSubscribers.add(subscriber);
        } else {
            locationSubscribers.put(location, new HashSet<>(Arrays.asList(subscriber)));
        }
    }

    public void removeSubscriberFromLocation(Subscriber subscriber, Location location) {
        Set<Subscriber> existentSubscriber = locationSubscribers.get(location);
        if (existentSubscriber != null) {
            locationSubscribers.get(location).remove(subscriber);
        }
    }

    public void removeSubscriber(Subscriber subscriber) {
        Collection<Set <Subscriber>> subscribersSets = locationSubscribers.values();
        for(Set<Subscriber> subscriberSet : subscribersSets){
            subscriberSet.remove(subscriber);
        }
    }

    public void sendAlertFromLocation(Alert alert, Location location) {
        Set<Subscriber> listSubscribers = locationSubscribers.get(location);
        if (listSubscribers != null) {
            listSubscribers.forEach(subscriber -> subscriber.receive(alert));
        }
    }

    public void sendNotificationFromLocation(Notification notification, Location location) {
        Set<Subscriber> listSubscribers = locationSubscribers.get(location);
        if (listSubscribers != null) {
            listSubscribers.forEach(subscriber -> subscriber.receive(notification));
        }
    }

    public void sendAlertToUniqueSubscribers(Alert alert) {
        Set<Subscriber> uniqueSubscribers = locationSubscribers.values().stream()
                .flatMap(subscribers -> subscribers.stream())
                .collect(Collectors.toSet());
        uniqueSubscribers.forEach(subscriber -> subscriber.receive(alert));
    }

    public void sendNotificationToUniqueSubscribers(Notification notification) {
        Set<Subscriber> uniqueSubscribers = locationSubscribers.values().stream()
                .flatMap(subscribers -> subscribers.stream())
                .collect(Collectors.toSet());
        uniqueSubscribers.forEach(subscriber -> subscriber.receive(notification));
    }

    public void removeLocation(Location location) {
        locationSubscribers.remove(location);
    }
}
