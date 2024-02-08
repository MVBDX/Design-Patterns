package ir.mvbdx.designpatterns.behavioral.observer.impl;

import java.util.*;

public class NotificationService {
    private final Map<EventType, List<EventListener>> subscribers = new EnumMap<>(EventType.class);

    public NotificationService() {
        Arrays.stream(EventType.values()).forEach(eventType -> subscribers.put(eventType, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, EventListener listener) {
        subscribers.get(eventType).add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener) {
        subscribers.get(eventType).remove(listener);
    }

    public void update(EventType eventType) {
        subscribers.get(eventType).forEach(listener -> listener.update(eventType));
    }

}
