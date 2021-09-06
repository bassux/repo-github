public class Dz1 {

    public static void main(String[] args) {

    Team team = new Team("DreamTeam","Вася", 50, "Эдик", 90, "Кирилл", 140, "Коля", 70);
    Course c = new Course(20,8,10,15,22);
    c.doIt(team);
    team.showInfo();
    team.showWhoPassed();

    }
}
