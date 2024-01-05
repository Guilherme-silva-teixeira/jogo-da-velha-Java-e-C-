#include <iostream>
#include <stdlib.h>

using namespace std;

#if defined (_WIN32) || defined (_WIN64)
int setContent()
{
	char x = 'X', y = 'Y' , positionF = x;
	if (positionF == x)
	{
		positionF = y;
	}
	else
	{
		positionF = x;
	}
	int position;
	std::cout << "insert the position of '" << positionF << "' :";
	std::cin >> position;
	return position;
}

int main()
{
	char board[3][3];
	char playerX = 'X', playerY = 'O';
	char positionX, positionY;
	char AtualPlayer = playerX;
	bool win = false;
		while (true)
		{
			if (AtualPlayer == playerX)
			{
				AtualPlayer = playerY;
			}
			else
			{
				AtualPlayer = playerX;
			}
			positionX = setContent();
			positionY = setContent();
			board[positionX][positionY] = AtualPlayer;
			for (int i = 0; i <= 2; i++)
			{
				for (int j = 0; j <= 2; j++)
				{
					std::cout << board[j][i] << " ";
				}
				std::cout << "\n";
			}
		}
}
#endif
