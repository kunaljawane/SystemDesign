public class LinearReg extends ModelTrainer{

    public LinearReg(String path1) {
      
    }

    @Override
    public void load(String path){
        System.out.println("Loading Linear Regression at path - "+path);
    }

    @Override
    public void train(String path){
        System.out.println("Training Linear Regression");
    }

    @Override
    public void test(String path){
        System.out.println("Testing Linear Regression");
    }

    @Override
    public void evaluate(String path){
         System.out.println("Evaluating Linear Regression");
    }

}