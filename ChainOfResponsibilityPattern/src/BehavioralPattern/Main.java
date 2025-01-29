package BehavioralPattern;

import BehavioralPattern.LoggerDesignerModel.LogProcessor;
import BehavioralPattern.LoggerDesignerModel.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(LogProcessor.ERROR, "Exception handling.");
        logger.log(LogProcessor.INFO, "info log test");
        logger.log(LogProcessor.DEBUG, "Degug test");
        
    }
}
