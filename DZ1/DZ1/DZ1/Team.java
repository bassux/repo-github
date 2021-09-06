import javax.sound.midi.Soundbank;

public class Team {



    Participant[] partsipants = new Participant[4];
    String teamname;

    Team(String teamname, String name1, int en1, String name2, int en2, String name3, int en3, String name4, int en4) {
        this.teamname = teamname;
        this.partsipants[0] = new Participant(name1, en1);
        this.partsipants[1] = new Participant(name2, en2);
        this.partsipants[2] = new Participant(name3, en3);
        this.partsipants[3] = new Participant(name4, en4);
    }

      public void showInfo() {

            System.out.println("Название команды: " + teamname);

            for (int i = 0; i < 4; i++) {

                System.out.println("Участник " + (i+1) + ":" + partsipants[i].name);
                System.out.println("Выносливость: " + partsipants[i].energy);
                System.out.println();


            }

        }

        public void showWhoPassed(){
            System.out.println("Следующие участники команды " + teamname + " прошли дистанцию:");


            for (int i=0;i<4;i++){

            if(partsipants[i].canPass){

                System.out.println("Участник " + (i+1) + ":" + partsipants[i].name);

            }

        }

        }


}
