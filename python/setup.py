'''
@Author: rishi
'''
import setuptools

with open("README.md", "r") as fh:
    long_description = fh.read()

setuptools.setup(
    name="QuickDS",
    version="0.0.1",
    author="Rishi Raj",
    author_email="rishi772001@gmail.com",
    description="QuickDS is a library that contains a curated list of Input Formatting and Input Generating Functions that can be used to generate some commonly used Abstract data types without having to write any code from scratch.",
    long_description=long_description,
    long_description_content_type="text/markdown",
    url="https://github.com/varnaa/QuickDS/tree/master/python",
    packages=setuptools.find_packages(),
    classifiers=[
        "Programming Language :: Python :: 3",
        "License :: OSI Approved :: MIT License",
        "Operating System :: OS Independent",
    ],
    python_requires='>=3.6',
)
