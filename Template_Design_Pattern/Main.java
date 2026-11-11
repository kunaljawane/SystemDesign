public class Main{
    public static void main(String[] args) {

        String path = "c/desktop/kunal/modeldata";

        ModelTrainer mt = new LinearReg(path);

        mt.trainModel(path);


        System.err.println("New Model------------------------------------");


        ModelTrainer mt2 = new LogisticReg(path);

        mt2.trainModel(path);




    }
}