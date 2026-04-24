package antoniogiovanni.marchese.dto.events;

public class StudentEvent {

    private String eventType;
    private Long id;
    private String name;

    public StudentEvent() {
    }

    public StudentEvent(String eventType, Long id, String name) {
        this.eventType = eventType;
        this.id = id;
        this.name = name;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
