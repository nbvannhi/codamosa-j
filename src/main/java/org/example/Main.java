package org.example;

public class Main {

    public static void main(String[] args) {

        String source = "import java.io.*;\n" +
                "import java.lang.*;\n" +
                "import java.lang.Math;\n" +
                "import java.util.Scanner;\n" +
                "public class BasicCalculator {\n" +
                " \n" +
                "    public static void calculate(String[] args)\n" +
                "    {\n" +
                "        // stores two numbers\n" +
                "        double num1, num2;\n" +
                " \n" +
                "        // Take input from the user\n" +
                "        Scanner sc = new Scanner(System.in);\n" +
                " \n" +
                "        System.out.println(\"Enter the numbers\");\n" +
                " \n" +
                "        // take the inputs\n" +
                "        num1 = sc.nextDouble();\n" +
                " \n" +
                "        num2 = sc.nextDouble();\n" +
                " \n" +
                "        System.out.println(\"Enter the operator (+,-,*,/)\");\n" +
                " \n" +
                "        char op = sc.next().charAt(0);\n" +
                " \n" +
                "        double o = 0;\n" +
                " \n" +
                "        switch (op) {\n" +
                " \n" +
                "        // case to add two numbers\n" +
                "        case '+':\n" +
                " \n" +
                "            o = num1 + num2;\n" +
                " \n" +
                "            break;\n" +
                " \n" +
                "        // case to subtract two numbers\n" +
                "        case '-':\n" +
                " \n" +
                "            o = num1 - num2;\n" +
                " \n" +
                "            break;\n" +
                " \n" +
                "        // case to multiply two numbers\n" +
                "        case '*':\n" +
                " \n" +
                "            o = num1 * num2;\n" +
                " \n" +
                "            break;\n" +
                " \n" +
                "        // case to divide two numbers\n" +
                "        case '/':\n" +
                " \n" +
                "            o = num1 / num2;\n" +
                " \n" +
                "            break;\n" +
                " \n" +
                "        default:\n" +
                " \n" +
                "            System.out.println(\"You enter wrong input\");\n" +
                " \n" +
                "             \n" +
                "        }\n" +
                " \n" +
                "        System.out.println(\"The final result:\");\n" +
                " \n" +
                "        System.out.println();\n" +
                " \n" +
                "        // print the final result\n" +
                "        System.out.println(num1 + \" \" + op + \" \" + num2\n" +
                "                           + \" = \" + o);\n" +
                "    }\n" +
                "}";

        OpenAILanguageModel model = new OpenAILanguageModel();

        model.setTestSrc(source);
        model.setAuthorizationKey(System.getenv("OPENAI_TOKEN"));
        model.setCompleteModel("text-davinci-003");
        model.setEditModel("code-davinci-edit-001");
        model.setTemperature(1.0);

        String out = model.callCompletion("calculate()", -1, -1);
        System.out.println(out);
    }
}