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

package Empregado;

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
        Trabalho trabalho = new Trabalho();

        System.out.println("Digite o CNPJ do Empregado: ");
        trabalho.cnpj = sc.nextInt();
        System.out.println("Digite a Razzão Social do Trabalho: ");
        trabalho.razaoSocial = sc.next();
        System.out.println("Digite o nome da Rua: ");
        trabalho.rua = sc.next();
        System.out.println("Digite o numero da Rua: ");
        trabalho.numero = sc.nextInt();
        System.out.println("Digite o cep da Rua: ");
        trabalho.cep = sc.nextInt();
        System.out.println("Digite o bairro da Rua: ");
        trabalho.bairro = sc.next();
        System.out.println("Digite a cidade da Rua: ");
        trabalho.cidade = sc.next();
        System.out.println("Digite o estado da Rua: ");
        trabalho.estado = sc.next();
        System.out.println(trabalho);
    }

}
