package unisinos.imdb.classes;

public class Teste {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        String[] p = {"ddd", "fff", "ggg"};
        String[] p2 = {"qqq", "www", "iii"};
        Audiovisual a = new Filme("111", "aaa", "bbb", 2000, Genero.ACAO, p,
                2.5);
        Audiovisual a2 = new Serie("666", "ggg", "eee", 700, Genero.AVENTURA,
                p2,
                8, 65);

        b.adicionaMidia(a);

        System.out.println(b.getMidia()[0]);

        b.removeMidia(a);

        System.out.println(b.getMidia()[0]);


        b.adicionaMidia(a2);

        System.out.println(b.getMidia()[1]);
    }
}
