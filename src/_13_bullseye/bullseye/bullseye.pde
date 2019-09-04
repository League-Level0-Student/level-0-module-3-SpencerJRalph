void setup () {
  size (400, 400);
  int r = 50;
  int b = 45;
  for(int i = 20; i > 0; i--) {
    if(i % 2 == 0){
    fill(#FF0808);
      ellipse(200, 200, i * 15, i *15);
  }
  else {
    fill(#000000);
    ellipse(200,200, i * 15, i * 15);
    
    
  }
  }
}


void draw() {
  
  
  
  
}
