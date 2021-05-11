public class waiting {
    enum types {
        Quedarse,
        Mirarreloj,
        Cosasporhacer,
        Aburrirse,
        Salirse
    }
    public static void execute(int n){
        double u ;
        types currentmood =types.Quedarse;
        for (int i =0; i<n; i++){
            u=Math.random();
            System.out.println(currentmood + "("+u+")");
            if (currentmood==types.Salirse)
                break;
            switch (currentmood){
                case Quedarse:
                    if(u<0.1){
                        currentmood = types.Salirse;
                    }else{
                        if(u<0.2){
                            currentmood = types.Aburrirse;
                        }else {
                            if(u<0.6)
                                currentmood = types.Mirarreloj;

                        }
                    }
                    break;
                case Mirarreloj:
                    if(u<0.2){
                        currentmood = types.Salirse;
                    }else{
                        if(u<0.5){
                            currentmood = types.Quedarse;
                        }else {
                            if(u<0.8)
                                currentmood = types.Cosasporhacer;

                        }
                    }
                    break;
                case Cosasporhacer:
                    if(u<0.1){
                        currentmood = types.Mirarreloj;
                    }else{
                        if(u<0.3){
                            currentmood = types.Quedarse;
                        }else {
                            if(u<0.6)
                                currentmood = types.Salirse;
                            else
                                if(u<0.9)
                                    currentmood = types.Aburrirse;
                        }
                    }
                    break;
                case Aburrirse:
                    if(u<0.1){
                        currentmood = types.Quedarse;
                    }else{
                        if(u<0.2){
                            currentmood = types.Mirarreloj;
                        }else {
                            if(u<0.4)
                                currentmood = types.Cosasporhacer;
                            else
                                if (u<0.8)
                                    currentmood = types.Salirse;

                        }
                    }
                    break;

            }


        }
    }

    public static void main(String[] args) {
        execute(30);
    }
}
