package com.company.circle;
import java.lang.Math;

 class Circle {

     private double rad;
     private double diam;


     public Circle() {
     }

     //Конструктор
     public Circle(double rad) {
         this.rad = rad;
         if (this.rad < 0)
             this.rad = 0;
         this.diam = 2.0 * this.rad;
     }

     //Устанавливаем радиус
     public void setRad(double rad) {
         this.rad = rad;
         if (this.rad < 0)
             this.rad = 0;
         this.diam = 2.0 * this.rad;
     }

     //Получаем радиус
     public double getRad() {
         return this.rad;
     }

     //Устанавливаем диаметр
     public void setDiam(double diam) {
         this.diam = diam;
         if (this.diam < 0)
             this.diam = 0;
         this.rad = this.diam / 2.0;
     }

     //Получаем диаметр
     public double getDiam() {
         return this.diam;
     }

     //Расчет длины окружности
     public double getCircumference() {
         return Math.PI * this.diam;
     }

     //Расчет площади
     public double getSquare() {
         return Math.PI * Math.pow(this.rad, 2);
     }

     @Override
     public String toString() {
         return "This is a circle of rad " + this.rad + ", diam " + this.diam + ". It's circumference is "
                 + this.getCircumference() + " and it's square is " + this.getSquare() + "!";
     }
 }


    class CircleTest {

         public static void main(String[] args) {

            //Высчитываем показатели окружности
            double initialRadius = -5.0 + Math.random()*10.0;
            Circle circle = new Circle(initialRadius);
            System.out.println("\nCircumference: " + circle.getCircumference());
            System.out.println("Square: " + circle.getSquare());
            System.out.println("Radius: " + circle.getRad());
            System.out.println("Diameter: " + circle.getDiam());
            System.out.println("\nSummary:");
            System.out.println(circle);

            //Меняем радиус
            System.out.println("\nSetting new radius");
            double newRadius = 1.0 + Math.random()*10.0;
            circle.setRad(newRadius);
            System.out.println("\nNew radius: " + newRadius + "!");
            System.out.println("\nSummary: ");
            System.out.println(circle);

            //Меняем диаметр
            System.out.println("\nSetting new diameter");
            double newDiameter = 2.0 + Math.random()*20.0;
            circle.setDiam(newDiameter);
            System.out.println("\nNew diameter: " + newDiameter);
            System.out.println("\nSummary:");
            System.out.println(circle);
        }

    }
