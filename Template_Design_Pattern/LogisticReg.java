public class LogisticReg extends ModelTrainer{

    public LogisticReg(String path1){

    }

    @Override
    public void load(String path){
        System.out.println("Loading Logistic Regression"+path);
    }

    @Override
    public void train(String path){
        System.out.println("Training Logistic Regression");
    }

    @Override
    public void test(String path){
        System.out.println("Testing Logistic Regression");
    }

    @Override
    public void evaluate(String path){
         System.out.println("Evaluating Logistic Regression");
    }

}