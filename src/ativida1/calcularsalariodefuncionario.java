package ativida1;

public class calcularsalariodefuncionario {

    private String nome;
    private int salariobase;
    private String cargo;

    public int calcular(String cargo, int salario) {

        switch (cargo) {

            case "desenvolvedor":
                if (salario >= 3000) {
                    salario = (int) (salario - (0.2 * salario));
                    return salario;
                } else {

                    salario = (int) (salario - (0.1 * salario));
                    return salario;
                }
            case "DBA":
                if (salario >= 2000) {
                    salario = (int) (salario - (0.25 * salario));
                    return salario;
                } else {
                    salario = (int) (salario - (0.15*salario));
                    return salario;
                }
            case "testador":
                if (salario >= 2000) {
                    salario = (int) (salario - (0.25*salario));
                    return salario;
                } else {
                    salario = (int) (salario - (0.15*salario));
                    return salario;
                }
            case "gerente":
                if (salario >= 5000) {
                    salario = (int) (salario - (0.3*salario));
                    return salario;
                } else {
                    salario = (int) (salario - (0.2*salario));
                    return salario;
                }
        }
        return 0;

    }


}
