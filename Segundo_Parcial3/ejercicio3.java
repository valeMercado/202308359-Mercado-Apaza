public class ejercicio3
{
   
    public static void mirarArbol() {
        
        // Ejemplo 1
        // Tree<String> rootNode = new Tree<String>("c");
        
        // Tree<String> childA = rootNode.addChild("a");
        //Tree<String> childU = rootNode.addChild("u");
        //Tree<String> childH = rootNode.addChild("h");
        
        //Tree<String> childAT = childA.addChild("t");
        //Tree<String> childUT = childU.addChild("t");
        //Tree<String> childHE = childH.addChild("e");
        //Tree<String> childHU = childH.addChild("u");
        
        //Tree<String> childATS = childAT.addChild("s");
        //Tree<String> childUTP = childUT.addChild("p");
        //Tree<String> childUTE = childUT.addChild("e");
        //Tree<String> childHUI = childHU.addChild("i");
        //Tree<String> childHUS = childHU.addChild("s");  
        
        
        // Ejemplo 2
        
        Tree<String> rootNode = new Tree<String>("a");
        
        Tree<String> childB = rootNode.addChild("b");
        Tree<String> childC = rootNode.addChild("c");
        
        Tree<String> childBD = childB.addChild("d");
        Tree<String> childBE = childB.addChild("e");
        
        Tree<String> childCF = childC.addChild("f");
        Tree<String> childCG = childC.addChild("g");
        
        Tree<String> childBDH = childBD.addChild("h");
        Tree<String> childBDI = childBD.addChild("i");
 
    
        rootNode.mostrar();
    }
    
}
