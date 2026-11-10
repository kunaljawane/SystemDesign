public class StartFacade{
    Cpu cpu = new Cpu();
    Bios bios = new Bios();
    OS os = new OS();

    public void startFacade(){
        System.out.println("-------Starting Computer------");

        bios.start();
        cpu.start();
        os.start();
        
        System.out.println("-------Started Succesfully------");
    }


}