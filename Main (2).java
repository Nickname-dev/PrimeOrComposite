class Main {
  public static void main(String[] args) {
   int x = 100 ; 
    int y;
    
    
      for(y = 2 ; y < x ; y = y + 1){
        if(x % y == 0) {
        
          System.out.println(x + " is composite") ;
          break;        
          }
        
          if(y == x - 1){
          if(x % y != 0) {
            System.out.println(x + " is prime");
          }
      }
}
}  
}  
