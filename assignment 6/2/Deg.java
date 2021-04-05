class Degree{
  public void getDegree(){
    System.out.println("I got a degree");
  }
}

class Undergraduate extends Degree{
  public void getDegree(){
    super.getDegree();
    System.out.println("I am an Undergraduate");
  }
}

class Postgraduate extends Degree{
  public void getDegree(){
    super.getDegree();
    System.out.println("I am a Postgraduate");
  }
}

class Deg{
  public static void main(String[] args){
    Undergraduate a = new Undergraduate();
    Postgraduate b = new Postgraduate();
    a.getDegree();
    b.getDegree();
  }
}