  int li, num;
    System.out.println("Ingrese la cantidad de nuemros a evaluar: ");
    Scanner sc = new Scanner(System.in);
    li= sc.nextInt();
                    int np = 0;
                    int nip=05;

    for(int i=1; i<=li; i++)
    {
        System.out.println("Ingrese su numero #" + i);
        num = sc.nextInt();
        if(num%2==0)
        {
            np = num;
        }
        else
        {
            nip= num;
        }
    }
    System.out.println("Los numeros pares son: ");
    System.out.println(np);
    System.out.println("Los numeros inpares pares son: "+ nip);
