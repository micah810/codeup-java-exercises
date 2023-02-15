package shapes;

 class Square extends Rectangle {
     public Square(double side){
         super(side, side);
     }
    Square mySquare = new Square(4);
    double area = mySquare.getArea();
    double perimeter = mySquare.getPerimeter();
}

