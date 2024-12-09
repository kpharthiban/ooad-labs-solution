class Car extends MotorVehicle implements IntName {
// field, constructor, and 
// method declarations
    @Override
    void move() {
        System.out.println("Car is moving");
    }
    
    @Override
    public boolean aFunction() {
        return true;
    }
    
    @Override
    public void anotherFunction() {
        System.out.println("Function Implemented");
    }
    }
