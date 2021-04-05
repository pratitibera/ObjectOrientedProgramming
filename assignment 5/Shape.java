public class Shape {
 String color;
 boolean filled;
 Shape(){
 this.color = "red";
 this.filled = true;
 }
 Shape(String color,boolean filled){
 this.color=color;
 this.filled=filled;
 }
 String getColor(){
 return this.color;
 }
 void setColor(String color){
 this.color =color;
 }
 boolean isFilled(){
 return this.filled;
 }
 void setFilled(boolean filled){
 this.filled=filled;
 }

 public String toString() {
 return "Shape[color=" + this.color + ",filled=" + this.filled +
"]";
 }
 public static void main(String args[]) {
 Shape s1 = new Shape();
 Circle c1 = new Circle();
 Rectangle r1 = new Rectangle();
 Square sq1 = new Square();

 System.out.println(s1.toString());
 System.out.println(c1.toString());
 System.out.println(r1.toString());
 System.out.println(sq1.toString());
 }
}
class Circle extends Shape{
 double radius;
 Circle(){
 this.radius=1.0;
 }
 Circle(double radius){
 this.radius=radius;
 }
 Circle(double radius,String color,boolean filled){
 super(color, filled);
 this.radius=radius;
 }
 public double getRadius() {
 return this.radius;
 }
 public void setRadius(double radius) {
 this.radius = radius;
 }
 double getArea(){
 return 3.14*this.radius*this.radius;
 }
 double getPerimeter(){
 return 2*3.14*this.radius;
 }
 public String toString() {
 return "Circle[Shape[color=" + this.color + ",filled=" +
this.filled +"],radius="+this.radius+ "]";
 }
}
class Rectangle extends Shape{
 double length,width;
 public Rectangle() {
 this.length = 1.0;
 this.width = 1.0;
 }
 public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
 }
 public Rectangle(String color, boolean filled, double length,
double width) {
 super(color, filled);
 this.length = length;
 this.width = width;
 }
 public double getLength() {
 return length;
 }
 public void setLength(double length) {
 this.length = length;
 }
 public double getWidth() {
 return width;
 }
 public void setWidth(double width) {
 this.width = width;
 }
 double getArea(){
 return length*width;
 }
 double getPerimeter(){
 return 2*(length+width);
 }
 public String toString() {
 return "Rectangle[Shape[color=" + this.color + ",filled=" +
this.filled +"],length=" + this.length + ", width=" + this.width +
"]";
 }

}
class Square extends Rectangle{
 public Square() {
 }
 public Square(double side) {
 super(side,side);
 }
 public Square(String color, boolean filled, double side) {
 super(color, filled, side, side);
 }
 public double getSide() {
 return length;
 }
 public void setSide(double side) {
 this.length=this.width = side;
 }
 public void setLength(double side) {
 this.length=this.width = side;
 }
 public void setWidth(double side) {
 this.length=this.width = side;
 }
 public String toString() {
 return "Square[Rectangle[Shape[color=" + this.color +
",filled=" + this.filled +"],length=" + this.length + ", width=" +
this.width + "]]";
 }
}
