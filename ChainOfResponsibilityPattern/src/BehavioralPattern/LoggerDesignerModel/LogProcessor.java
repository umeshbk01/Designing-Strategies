package BehavioralPattern.LoggerDesignerModel;

public class LogProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    public LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }
    public void log(int logLevel, String msg){
        if(nextLogProcessor != null){
            this.nextLogProcessor.log(logLevel, msg);
        }
    }
}
