package exceptions;

class CacheMissException extends RuntimeException{
    public CacheMissException(String message){
        super(message);
    }
}

class SimulatedFileReader implements AutoCloseable{
    private final String filename;

    public SimulatedFileReader(String filename){
        this.filename = filename;
        System.out.println("Opening " + filename);
    }

    String read(){
        if(filename.equals("missing.txt")){
            throw new CacheMissException("Cache miss for: " + filename);
        }
        return "contents of " + filename;
    }

    @Override
    public void close(){
        System.out.println("Closing " + filename);
    }
}

public class CacheMissDemo{
    public static void main(String[] args){
        try(SimulatedFileReader reader = new SimulatedFileReader("missing.txt")){
            System.out.println(reader.read());
        }catch(CacheMissException e){
            System.out.println("Logged cleanly: " + e.getMessage());
        }
    }
}