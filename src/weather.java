public class weather {
    enum types {
        Soleado,
        Ventoso,
        Lluvioso,
        Tormentoso
    }
    public static void execute(int n, types currentstate){
        // 0 -> Soleado
        // 1 -> Ventoso
        // 2 -> Lluvioso
        // 3 -> Tormentoso

        double u ;
        for (int i =0; i<n; i++){
            u=Math.random();
            System.out.println(currentstate + "("+u+")");
           switch (currentstate){
               case Ventoso:
                   if(u<0.1){
                    currentstate = types.Tormentoso;
                   }else{
                       if(u<0.3){
                           currentstate = types.Soleado;
                       }else {
                           if(u<0.5)
                               currentstate = types.Lluvioso;

                       }
                   }
                   break;
               case Lluvioso:
                   if(u<0.1){
                       currentstate = types.Soleado;
                   }else{
                       if(u<0.3){
                           currentstate = types.Tormentoso;
                       }else {
                           if(u<0.5)
                                currentstate = types.Ventoso;

                       }
                   }
                   break;
               case Tormentoso:
                   if(u<0.1){
                       currentstate = types.Ventoso;
                   }else{
                       if(u<0.5)
                           currentstate = types.Lluvioso;
                   }
                   break;
               case Soleado:
                   if(u<0.1){
                       currentstate = types.Lluvioso;
                   }else{
                       if(u<0.5)
                           currentstate = types.Ventoso;
                   }
                   break;
           }

        }
    }


    public static void main(String[] args) {

        execute(30, types.Tormentoso);

    }
}
