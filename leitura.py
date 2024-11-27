import os
import fnmatch

def read_files_in_directory(directory, patterns, output_file):
    with open(output_file, 'w', encoding='utf-8') as outfile:
        for root, dirs, files in os.walk(directory):
            for pattern in patterns:
                for filename in fnmatch.filter(files, pattern):
                    filepath = os.path.join(root, filename)
                    with open(filepath, 'r', encoding='utf-8') as file:
                        outfile.write(f"Reading file: {filepath}\n")
                        outfile.write(file.read())
                        outfile.write("\n" + "="*80 + "\n\n")

# Diretório do projeto
project_directory = '.'

# Padrões de arquivos a serem lidos
file_patterns = ['*.java', '*.xml', '*.properties', '*.py', '*.yaml', '*.yml']

# Nome do arquivo de saída
output_file = 'allFiles.txt'

# Ler todos os arquivos no diretório do projeto e escrever no arquivo de saída
read_files_in_directory(project_directory, file_patterns, output_file)