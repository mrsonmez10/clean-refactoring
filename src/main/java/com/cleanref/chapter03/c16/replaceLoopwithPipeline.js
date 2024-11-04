export function acquireData(input) {
    const lines = input.split("\n");
    return lines
        .splice(1)
        .filter((line) => line.trim() !== "")
        .map((line) => line.split(","))
        .filter((lineItems) => lineItems[1].trim() === "India")
        .map((lineItems) => ({
            city: lineItems[0].trim(),
            phone: lineItems[2].trim(),
        }));
}

// Java, javascript -> en çok kullanılan stream metotlarını bilmekte fayda var!