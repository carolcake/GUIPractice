/*
f = ma
abstractng Force Formula f = m * a
 */
package testguie;

public class Force
{

  // encapsulate (make attributes private and use *public* get and set methods 
  // to access them)
  private double mass;
  private double force;
  private double acceleration;

  public Force(double f, double a, double m)
  {
    this.force = f;
    this.acceleration = a;
    this.mass = m;
  }

  public Force()
  {
    // this.force = 0;
    setForce(0);
    this.mass = 0;
    this.acceleration = 0;
  }
  
  public double getForce()
  {
    return this.force;
  }
  public double getMass()
  {
    return this.mass;
  }
  public double getAcceleration()
  {
    return this.acceleration;
  }
  
  public void setForce(double force)
  {
    this.force = force;
  }
  public void setMass(double mass)
  {
    this.mass = mass;
  }
  public void setAcceleration(double acceleration)
  {
    this.acceleration = acceleration;
  }
  
  @Override
  public String toString()
  {
    String message = "Your mass is " + this.mass + ", your acceleration is " +
        this.acceleration + ", and your force is " + this.force;
    return message;
  }
  
  public double calculateForce(double m, double a)
  {
    double f;
    f = m * a;
    return f;
  }
  
  public double calculateMass(double f, double a)
  {
    double m;
    m = f / a;
    return m;
  }
  
  public double calculateAcceleration(double f, double m)
  {
    double a;
    a = f / m;
    return a;
  }
  
  public static void main(String[] args)
  {
    double result;
    Force objForce = new Force();
    result = objForce.calculateForce(3,4);
    System.out.println("Force is " + result);
    
    result = objForce.calculateMass(12,4);
    System.out.println("Mass is " + result);
    
    result = objForce.calculateAcceleration(16,4);
    System.out.println("Acceleration is " + result);
  }
}
