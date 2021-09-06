public class Course {

 Pool[] pools = new Pool[5];

 Course(int e1, int e2, int e3, int e4, int e5){

     this.pools[0] = new Pool(e1);
     this.pools[1] = new Pool(e2);
     this.pools[2] = new Pool(e3);
     this.pools[3] = new Pool(e4);
     this.pools[4] = new Pool(e5);

 }

 public void doIt(Team a)
 {
     int allEnergy=0;
     for (int i=0; i< pools.length; i++){
         allEnergy+=pools[i].energyToPass;
     }
     for (int i=0; i<a.partsipants.length; i++) {

        if(a.partsipants[i].getEnergy()>=allEnergy)
        {
            a.partsipants[i].setCanPass(true);
        }



    }

 }


}
