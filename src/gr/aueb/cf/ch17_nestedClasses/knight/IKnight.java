package gr.aueb.cf.ch17_nestedClasses.knight;

@FunctionalInterface
public interface IKnight {

    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
