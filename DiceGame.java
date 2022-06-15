/*
 Name: Shubham Sadashiv Dhamane
Student id: A00257743
Subject: JAV1001
Topic: classes and objects (LAB3)
 */
import java.util.Random;
class DiceGame{
    public static void main(String args[]) {

        System.out.println("Creating default d6...");       //default dice rolling
        Die d1 = new Die();
        d1.roll();
        if (d1.getCurrentSide() == d1.getNumOfSides()){
            System.out.println("YAY! It's a "+d1.getCurrentSide());
        }else{
        System.out.println("The current side up for "+d1.getType()+" is: "+d1.getCurrentSide());
        }

        Die d2 = new Die(20);                           //d20 rolling
        d2.roll();
        if (d2.getCurrentSide() == d2.getNumOfSides()){
            System.out.println("YAY! It's a "+d2.getCurrentSide());
        }else{
        System.out.println("The current side up for "+d2.getType()+" is: "+d2.getCurrentSide());
        }

        Die d3 = new Die(10, "percentile");         //d10 rolling
        d3.roll();
        if (d3.getCurrentSide() == d3.getNumOfSides()){
            System.out.println("YAY! It's a "+d3.getCurrentSide());
        }else{
        System.out.println("The current side up for "+d3.getType()+" is: "+d3.getCurrentSide());
        }

        System.out.println("Testing the roll method");

        System.out.println("Rolling the "+d1.getType());
        d1.roll();                                                  //new value of d1
        if (d1.getCurrentSide() == d1.getNumOfSides()){
            System.out.println("YAY! It's a "+d1.getCurrentSide());
        }else{
        System.out.println("The new value for "+d1.getType()+" is: "+d1.getCurrentSide());
        }

        System.out.println("Rolling the "+d2.getType());
        d2.roll();                                                  //new value of d2
        if (d2.getCurrentSide() == d2.getNumOfSides()){
            System.out.println("YAY! It's a "+d2.getCurrentSide());
        }else{
        System.out.println("The new value for "+d2.getType()+" is: "+d2.getCurrentSide());
        }

        System.out.println("Rolling the "+d3.getType());
        d3.roll();                                                 //new value of d3
        if (d3.getCurrentSide() == d3.getNumOfSides()){
            System.out.println("YAY! It's a "+d3.getCurrentSide());
        }else{
        System.out.println("The new value for "+d3.getType()+" is: "+d3.getCurrentSide());
        }

        d2.setCurrentSide(20);                         // setting side 
        System.out.println("The side up is "+d2.getCurrentSide()+". Finally");

        System.out.println("----\nBonus\n----");
        System.out.println("Creating 5 d6...");                  // bonus
        Die d4 = new Die();
        Die d5 = new Die();
        Die d6 = new Die();
        Die d7 = new Die();
        Die d8 = new Die();
        Die d9 = new Die();


        Boolean flag = false;
        int count = 0;

        do{
            d4.roll();
            d5.roll();
            d6.roll();
            d7.roll();
            d8.roll();
            d9.roll();
            count +=1;



            if(d4.getCurrentSide() == d5.getCurrentSide() && d6.getCurrentSide() == d7.getCurrentSide() && d8.getCurrentSide() == d9.getCurrentSide()){
                if(d4.getCurrentSide() == d6.getCurrentSide() && d4.getCurrentSide()== d6.getCurrentSide()){
                    System.out.println("YAHZEE! it took "+count+" rolls");
                    flag = true;
                }
            }


        }while(flag == false);

    }
}



class Die {
    private int numOfSides, currentSide;
    private String type;


        public Die(){                                       //defaulr constructor
            setType("d6");
            setNumOfSides(6);

        }

        public Die(int numOfSides){                          //constructor with 1 parameter
            setType("d"+numOfSides);
            setNumOfSides(numOfSides);
            System.out.println("creating a "+type);

        }
        public Die(int numOfSides, String type){
            setType(type);                                   //constructor with 1 parameter
            setNumOfSides(numOfSides);
            System.out.println("creating "+type+" die (a special "+numOfSides+")");
        }

        public int getNumOfSides(){                             //accessors and mutatorss
            return this.numOfSides;
        }
        public int getCurrentSide(){
            return this.currentSide;
        }
        public String getType(){
            return this.type;
        }
        public void setNumOfSides(int numOfSides){
            this.numOfSides = numOfSides;
        }
        public void setCurrentSide(int currentSide){
             this.currentSide = currentSide;
        }
        public void setType(String type){
            this.type = type;
       }


        public void roll(){                                         //rolling method

            Random num = new Random();
            currentSide = num.nextInt(1,numOfSides);

        }


    }
