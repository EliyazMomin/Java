public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
   
    public int expectedMinutesInOven(){
        return 40;
    }
    //reurn 40

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return 40-x;
    }
    //return 15

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int x){
        return 2 * x;
        // return 2 and 8
       
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
      return preparationTimeInMinutes(x) + y;
        //return (1,30)32, (4,8)16
    }
}
