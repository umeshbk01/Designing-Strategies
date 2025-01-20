package BehavioralPattern.LoggerDesignerModel;

public class Logger {
    LogProcessor logProcessor;
    public Logger(){
        logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(logProcessor)));
    }
    public void log(int logLevel, String msg){
        logProcessor.log(logLevel, msg);
    }
}
