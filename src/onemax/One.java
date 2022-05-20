/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onemax;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Jet_m
 */
public class One extends Agent{
    OneMax one = new OneMax();
    
    @Override
    public void setup(){
        addBehaviour(new myShot());
    }  
    
    private class myShot extends OneShotBehaviour{
        @Override
        public void action(){
        one.execute();
        }
        
        @Override
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
    

