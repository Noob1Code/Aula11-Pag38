/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package MusicaCompositor;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 20/03/2024
 * @brief Class Main
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compositores compositores = new Compositores() {
        };
        Musica musica = new Musica();

        exibirMenu();
        String opcao = sc.next();
        switch (opcao) {
            case "1":
                System.out.println("Digite o Nome do Compositor: ");
                compositores.nomeCompositor = sc.next();
                System.out.println("Digite a Nacionalidade do Compositor: ");
                compositores.nacionalidade = sc.next();
                System.out.println(compositores);
                break;

            case "2":
                System.out.println("Digite o Nome do Compositor: ");
                musica.nomeCompositor = sc.next();
                System.out.println("Digite a Nacionalidade do Compositor: ");
                musica.nacionalidade = sc.next();
                System.out.println("Digite o Nome da Musica: ");
                musica.nomeMusica = sc.next();
                System.out.println("Digite o tipo da Musica: ");
                musica.tipo = sc.next();
                System.out.println("Digite o ano da Musica: ");
                musica.ano = sc.nextInt();
                System.out.println(musica);
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1- Compositores");
        System.out.println("2- Onibus");
        System.out.print("Escolha uma opção: ");
    }

}
