// 12S21040 - Christina Putri Hutahaean
// 12S21041 - Samuel Christy Angie Sihotang

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct mahasiswa_t
{
  char nim[777];
  char nama[777];
  char ipk[777];
};

int main(int _argc, char **_argv)
{

  struct mahasiswa_t mhs[777];
  char input[777];
  char *sementara;
  float sebentar;
  float best = 0.00;
  int n = 0;
  int m;
  int p;

  while (1 == 1)
  {
    fgets(input, sizeof input, stdin);
    input[strlen(input) - 1] = '\0';
    sementara = strtok(input, "#");
    if (input[0] == '-' && input[1] == '-' && input[2] == '-')
    {
      return 0;
    }
    else if (strcmp(sementara, "student-add") == 0)
    {
      sementara = strtok(NULL, "#");
      strcpy(mhs[n].nim, sementara);

      sementara = strtok(NULL, "#");
      strcpy(mhs[n].nama, sementara);

      sementara = strtok(NULL, "#");
      strcpy(mhs[n].ipk, sementara);
      sebentar = atof(mhs[n].ipk);

      n++;

      if (sebentar > best)
      {
        best = sebentar;
      }
    }
    else if (input[13] == 'a' && input[14] == 'l' && input[15] == 'l')
    {
      for (m = 0; m < n; m++)
      {
        printf("%s|%s|%s\n", mhs[m].nim, mhs[m].nama, mhs[m].ipk);
      }
    }
    else if (input[13] == 'b' && input[14] == 'e' && input[15] == 's' && input[16] == 't')
    {
      gcvt(best, 3, sementara);
      for (m = 0; m < n; m++)
      {
        if (strcmp(mhs[m].ipk, sementara) >= 0)
        {
          p = m;
        }
      }
      printf("%s|%s|%s\n", mhs[p].nim, mhs[p].nama, mhs[p].ipk);
    }
  }
}
