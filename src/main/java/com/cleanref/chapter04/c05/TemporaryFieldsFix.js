function nameToObjectv2(name) {
    var fullName = name.split(" ");

    return {
        firstName: fullName[0],
        lastName: fullName[1],
    };
}

function sumv2(a, b) {
    return a + b;
}
