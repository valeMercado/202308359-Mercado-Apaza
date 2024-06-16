public class Doll
{
    public Pila<String> dollParts;
    
    public Doll() {
        this.dollParts = new Pila<String>();
    }
    
    public boolean canIInsert(String data) {
        boolean response = false;
        String tope = this.dollParts.top();
        
        if (tope != null && ((int) data.charAt(0) >= (int) tope.charAt(0))) {
            response = false;
        } else {
            response = true;
        }
        return response;
    }
    
    public void insertDollPart(String data) {
        this.dollParts.push(data);
    }
}
