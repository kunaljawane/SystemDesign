
class XMLToJSONAdaptor implements IReport{

    XMLProvider xml=new XMLProvider();

    @Override
    public void getReport(){
        System.out.println("JSON Converted "+xml.sendXMLData());
    }

}