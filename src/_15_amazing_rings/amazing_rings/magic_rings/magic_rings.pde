void setup() {
  size(800, 400);
}
int x = 200;
void draw() { 
  int size = 200;
 fill(#2703FC);
  rect(0,0,800,400);
  
  for(int i = 0; i < 35; i++) {
   
    noFill();
      ellipse(x, 200, size, size);
      size = size - 10;
  }    
  size = 200;
   for(int i = 0; i < 35; i++) {
   
    noFill();
      ellipse(400, 200, size, size);
      size = size - 10;
  }    
 
  if(x < 700) {
    x = x + 1;
  }
}
