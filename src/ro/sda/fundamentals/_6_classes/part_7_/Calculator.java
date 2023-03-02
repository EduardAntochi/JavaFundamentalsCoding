package ro.sda.fundamentals._6_classes.part_7_;

//2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
//        The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
//        In case the cost parameter is less than 0 it needs to set the cost field value to 0.
//        Write the following methods (instance methods):
//       * Method named getCost without any parameters, it needs to return the value of cost field
//        3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
//       The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
//        Write the following methods (instance methods):
//        * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public void setFloor(Floor floor){
        this.floor = floor;
    }

    public void setCarpet(Carpet carpet){
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
