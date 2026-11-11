public abstract class ModelTrainer{
    public abstract void load(String path);

    public abstract void train(String path);

    public abstract void test(String path);

    public abstract void evaluate(String path);

    public void trainModel(String path){
        System.out.println("Loading Model---------");

        load(path);

        System.out.println("Traning Model----------");

        train(path);

        System.out.println("Testing Model-----------");

        train(path);

        System.out.println("Evaluating Model---------");

        evaluate(path);

        System.out.println("Model Trained Sucessfully.");
    }

    
}