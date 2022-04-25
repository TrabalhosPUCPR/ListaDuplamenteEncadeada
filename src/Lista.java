public class Lista {
    No primeiro;
    No ultimo;

    public Lista(){
        this.primeiro = null;
        this.ultimo = null;
    }

    public No get(int index){
        No p = this.primeiro;
        int cont = 0;
        while(p != null){
            if(cont == index){
                return p;
            }
            p = p.proximo;
            cont++;
        }
        return null;
    }

    public void add_primeiro(int dado){
        No p = new No(dado);
        this.primeiro.anterior = p;
        p.proximo = this.primeiro;
        this.primeiro = p;
    }
    public void add_ultimo(int dado){
        No p = new No(dado);
        p.anterior = this.ultimo;
        this.ultimo.proximo = p;
        this.ultimo = this.ultimo.proximo;
    }
    public void add_depois(int index, int dado){add_depois(this.get(index), dado);}
    public void add_depois(No no, int dado){
        No p = this.primeiro;
        if(this.ultimo == no){
            this.add_ultimo(dado);
        }else{
            while(p != null){
                if(p == no){
                    No no2 = new No(dado);
                    no2.anterior = p;
                    no2.proximo = p.proximo;
                    p.proximo.anterior = no2; 
                    p.proximo = no2;
                    return;
                }
                p = p.proximo;
            }
            System.out.println("No nao encontrado na lista");
        }
    }
    public void add_antes(int index, int dado){add_antes(this.get(index), dado);}
    public void add_antes(No no, int dado){
        No p = this.primeiro;
        if(this.ultimo == no){
            this.add_ultimo(dado);
        }else{
            while(p != null){
                if(p == no){
                    No no2 = new No(dado);
                    no2.anterior = p.anterior;
                    no2.proximo = p;
                    p.anterior = no2; 
                    no2.anterior.proximo = no2;
                    return;
                }
                p = p.proximo;
            }
            System.out.println("No nao encontrado na lista");
        }
    }

    public void print(){
        No p = this.primeiro;
        System.out.print("[");
        while(p != null){
            System.out.print(p.dado);
            p = p.proximo;
            if(p != null){System.out.print(", ");}
        }
        System.out.println("]");
    }

    public void add_ordenado(int dado){
        No p = this.primeiro;
        if(p != null){
            if(p.dado > dado){ // caso for menor que o primeiro, coloca por primeiro (ou se tiver vazio)
                this.add_primeiro(dado);
            }else if(this.ultimo.dado < dado){ // caso for maior que o ultimo, coloca como o ultimo
                this.add_ultimo(dado);
            }else{
                while(p.dado < dado){ // verifica todas, e coloca onde o proximo for maior
                    if(p.proximo.dado > dado){
                        add_depois(p, dado);
                    }else{
                        p = p.proximo;
                    }
                }
            }
        }else{
            this.primeiro = new No(dado);
            this.ultimo = primeiro;
        }
    }
}
