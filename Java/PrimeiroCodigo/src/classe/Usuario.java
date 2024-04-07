package classe;

public class Usuario
{
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto)
    {
        if (objeto instanceof Usuario)
        {
            Usuario outro = (Usuario) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }
        else{

            return false;
        }

    }

    //     @Override
    // public boolean equals(Object obj)
    // {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Usuario other = (Usuario) obj;
    //     if (nome == null) {
    //         if (other.nome != null)
    //             return false;
    //     } else if (!nome.equals(other.nome))
    //         return false;
    //     if (email == null) {
    //         if (other.email != null)
    //             return false;
    //     } else if (!email.equals(other.email))
    //         return false;
    //     return true;
    // }
    
}