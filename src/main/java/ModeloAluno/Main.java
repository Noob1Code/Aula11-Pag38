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

package ModeloAluno;

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
        Cadastro cadastro = new Cadastro();

        System.out.println("Digite o nome do Aluno: ");
        cadastro.nomeAluno = sc.next();
        System.out.println("Digite a matricula do Aluno: ");
        cadastro.matricula = sc.nextInt();
        System.out.println("Digite o ano de ingresso da Aluno: ");
        cadastro.anoIngresso = sc.nextInt();
        System.out.println("Digite o nome do curso do Aluno: ");
        cadastro.curso = sc.next();
        System.out.println("Digite a sigla do Curso: ");
        cadastro.sigla = sc.next();
        System.out.println("Digite a duracao do Curso: ");
        cadastro.duracao = sc.next();
        System.out.println("Digite o nome do Departamento: ");
        cadastro.nomeDepartamento = sc.next();
        System.out.println("Digite a sigla do Departamento: ");
        cadastro.siglaDepartamento = sc.next();
        System.out.println(cadastro);
    }

}
