package gr.aueb.cf.ch17_nestedClasses.knight;

public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
