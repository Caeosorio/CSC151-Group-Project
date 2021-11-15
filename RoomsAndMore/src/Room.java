public class Room {              
      
   private int squareF;       
       
    public Room(int sqF) {      
         squareF = sqF;
}

    public int getSquareFeet() {   
      return squareF;
}

        public int getCapacity() {     
                int capacity;
                   capacity = squareF/9;
                   return capacity;
}
          public String toString() {    
                return " Square feet of room is: " + getSquareFeet() + " and the capacity of the room is: " + getCapacity();
  }
}
