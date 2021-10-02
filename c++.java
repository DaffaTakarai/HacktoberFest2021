#pragma once

#include <string>
#include <vector>
#include "asik.h"

int main(int argc, char **argv)
{
    std::vector<std::wstring> args(argv + 1, argv + argc);
    Tugas1Nomor1::main(args);
}

