package shapes;

 class Square extends Quadrilateral {
     public Square(double side){
         super(side, side);
     }
    Square mySquare = new Square(4);
    double area = mySquare.getArea();
    double perimeter = mySquare.getPerimeter();

     private double getPerimeter() {
         return 0;
     }
 }

